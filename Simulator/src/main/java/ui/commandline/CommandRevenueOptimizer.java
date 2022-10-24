/**
 * Copyright 2020 Alexander Herzog
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ui.commandline;

import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import language.Language;
import systemtools.commandline.AbstractCommand;
import systemtools.commandline.BaseCommandLineSystem;
import ui.RevenueOptimizer;
import ui.model.CallcenterModel;

/**
 * F�hrt eine Ertragsoptimierung durch
 * @author Alexander Herzog
 * @version 1.0
 * @see AbstractCommand
 * @see AbstractSimulationCommand
 * @see CommandLineSystem
 */
public class CommandRevenueOptimizer extends AbstractSimulationCommand {
	/** Eingabe-Modelldatei */
	private File inputFile;
	/** Ausgabe-Modelldatei */
	private File outputFile;

	/**
	 * Konstruktor der Klasse
	 * @param system	Referenz auf das Kommandozeilensystem
	 */
	public CommandRevenueOptimizer(final BaseCommandLineSystem system) {
		super(system);
	}

	@Override
	public String[] getKeys() {
		List<String> list=new ArrayList<>();
		list.add(Language.tr("CommandLine.RevenueOptimizer.Name"));
		for (String s: Language.trOther("CommandLine.RevenueOptimizer.Name")) if (!list.contains(s)) list.add(s);
		return list.toArray(new String[0]);
	}

	@Override
	public String getShortDescription() {
		return Language.tr("CommandLine.RevenueOptimizer.Description.Short");
	}

	@Override
	public String[] getLongDescription() {
		return Language.tr("CommandLine.RevenueOptimizer.Description.Long").split("\n");
	}

	@Override
	public String prepare(String[] additionalArguments, InputStream in, PrintStream out) {
		String s=parameterCountCheck(2,additionalArguments); if (s!=null) return s;

		inputFile=new File(additionalArguments[0]);
		outputFile=new File(additionalArguments[1]);
		if (!inputFile.isFile()) return String.format(Language.tr("CommandLine.Error.File.InputDoesNotExist"),inputFile);
		if (!isModelFile(inputFile)) return String.format(Language.tr("CommandLine.Error.File.InputNoValidCallCenterModel"),inputFile);
		if (outputFile.exists()) return String.format(Language.tr("CommandLine.Error.File.OutputAlreadyExist"),outputFile);

		return null;
	}

	@Override
	public void run(AbstractCommand[] allCommands, InputStream in, PrintStream out) {
		CallcenterModel baseModel=new CallcenterModel();
		String s=baseModel.loadFromFile(inputFile);
		if (s!=null) {out.println(Language.tr("Dialog.Title.Error").toUpperCase()+": "+Language.tr("CommandLine.Error.LoadingModel")+" "+s); return;}

		RevenueOptimizer revenueOptimizer=new RevenueOptimizer(baseModel);
		if (!revenueOptimizer.run()) {
			out.println(revenueOptimizer.getError());
		} else {
			CallcenterModel newModel=revenueOptimizer.getBestModel();
			if (!newModel.saveToFile(outputFile)) {out.println(Language.tr("Dialog.Title.Error").toUpperCase()+": "+Language.tr("CommandLine.Error.SavingModel")); return;}
		}
	}

}
