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
package mathtools.distribution.tools;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.stream.Stream;

import javax.swing.ImageIcon;

import org.apache.commons.math3.distribution.AbstractRealDistribution;

import mathtools.NumberTools;
import mathtools.distribution.DataDistributionImpl;
import mathtools.distribution.NeverDistributionImpl;

/**
 * Liefert verschiedene Informationen zu kontinuierlichen Verteilungen
 * @author Alexander Herzog
 * @version 2.3
 * @see AbstractRealDistribution
 */
public final class DistributionTools {
	/** Empirische Daten */
	public static String[] DistData=new String[]{"Empirische Daten"};

	/** Wikipedia-Seite Empirische Daten */
	public static String DistDataWikipedia="https://de.wikipedia.org/wiki/Empirische_Verteilungsfunktion";

	/** Niemals-Verteilung */
	public static String[] DistNever=new String[]{"Niemals","nie"};

	/** Wikipedia-Seite Niemals-Verteilung */
	public static String DistNeverWikipedia=null;

	/** Punkt "unendlich" */
	public static String[] DistInfinite=new String[]{"unendlich"};

	/** Wikipedia-Seite Punkt "unendlich" */
	public static String DistInfiniteWikipedia=null;

	/** Ein-Punkt-Verteilung */
	public static String[] DistPoint=new String[]{"Ein-Punkt-Verteilung"};

	/** Wikipedia-Seite Ein-Punkt-Verteilung */
	public static String DistPointWikipedia=null;

	/** Gleichverteilung */
	public static String[] DistUniform=new String[]{"Gleichverteilung"};

	/** Wikipedia-Seite Gleichverteilung */
	public static String DistUniformWikipedia="https://de.wikipedia.org/wiki/Stetige_Gleichverteilung";

	/** Exponentialverteilung */
	public static String[] DistExp=new String[]{"Exponentialverteilung"};

	/** Wikipedia-Seite Exponentialverteilung */
	public static String DistExpWikipedia="https://de.wikipedia.org/wiki/Exponentialverteilung";

	/** Normalverteilung */
	public static String[] DistNormal=new String[]{"Normalverteilung"};

	/** Wikipedia-Seite Normalverteilung */
	public static String DistNormalWikipedia="https://de.wikipedia.org/wiki/Normalverteilung";

	/** Lognormalverteilung */
	public static String[] DistLogNormal=new String[]{"Lognormalverteilung"};

	/** Wikipedia-Seite Lognormalverteilung */
	public static String DistLogNormalWikipedia="https://de.wikipedia.org/wiki/Logarithmische_Normalverteilung";

	/** Erlang-Verteilung */
	public static String[] DistErlang=new String[]{"Erlang-Verteilung"};

	/** Wikipedia-Seite Erlang-Verteilung */
	public static String DistErlangWikipedia="https://de.wikipedia.org/wiki/Erlang-Verteilung";

	/** Gamma-Verteilung */
	public static String[] DistGamma=new String[]{"Gamma-Verteilung"};

	/** Wikipedia-Seite Gamma-Verteilung */
	public static String DistGammaWikipedia="https://de.wikipedia.org/wiki/Gammaverteilung";

	/** Beta-Verteilung */
	public static String[] DistBeta=new String[]{"Beta-Verteilung"};

	/** Wikipedia-Seite Beta-Verteilung */
	public static String DistBetaWikipedia="https://de.wikipedia.org/wiki/Beta-Verteilung";

	/** Cauchy-Verteilung */
	public static String[] DistCauchy=new String[]{"Cauchy-Verteilung"};

	/** Wikipedia-Seite Cauchy-Verteilung */
	public static String DistCauchyWikipedia="https://de.wikipedia.org/wiki/Cauchy-Verteilung";

	/** Weibull-Verteilung */
	public static String[] DistWeibull=new String[]{"Weibull-Verteilung"};

	/** Wikipedia-Seite Weibull-Verteilung */
	public static String DistWeibullWikipedia="https://de.wikipedia.org/wiki/Weibull-Verteilung";

	/** Chi-Verteilung */
	public static String[] DistChi=new String[]{"Chi-Verteilung"};

	/** Wikipedia-Seite Chi-Verteilung */
	public static String DistChiWikipedia="https://en.wikipedia.org/wiki/Chi_distribution"; /* Keine deutsche Wikipedia-Seite vorhanden */

	/** Chi^2-Verteilung */
	public static String[] DistChiSquare=new String[]{"Chi^2-Verteilung"};

	/** Wikipedia-Seite Chi^2-Verteilung */
	public static String DistChiSquareWikipedia="https://de.wikipedia.org/wiki/Chi-Quadrat-Verteilung";

	/** F-Verteilung */
	public static String[] DistF=new String[]{"F-Verteilung"};

	/** Wikipedia-Seite F-Verteilung */
	public static String DistFWikipedia="https://de.wikipedia.org/wiki/F-Verteilung";

	/** Jonhson-SU-Verteilung */
	public static String[] DistJohnson=new String[]{"Jonhson-SU-Verteilung"};

	/** Wikipedia-Seite Jonhson-SU-Verteilung */
	public static String DistJohnsonWikipedia="https://en.wikipedia.org/wiki/Johnson%27s_SU-distribution"; /* Keine deutsche Wikipedia-Seite vorhanden */

	/** Dreiecksverteilung */
	public static String[] DistTriangular=new String[]{"Dreiecksverteilung"};

	/** Wikipedia-Seite Dreiecksverteilung */
	public static String DistTriangularWikipedia="https://de.wikipedia.org/wiki/Dreiecksverteilung";

	/** Pert-Verteilung */
	public static String[] DistPert=new String[]{"Pert-Verteilung"};

	/** Wikipedia-Seite Pert-Verteilung */
	public static String DistPertWikipedia="https://en.wikipedia.org/wiki/PERT_distribution"; /* Keine deutsche Wikipedia-Seite vorhanden */

	/** Laplace-Verteilung */
	public static String[] DistLaplace=new String[]{"Laplace-Verteilung"};

	/** Wikipedia-Seite Laplace-Verteilung */
	public static String DistLaplaceWikipedia="https://de.wikipedia.org/wiki/Laplace-Verteilung";

	/** Pareto-Verteilung */
	public static String[] DistPareto=new String[]{"Pareto-Verteilung"};

	/** Wikipedia-Seite Pareto-Verteilung */
	public static String DistParetoWikipedia="https://de.wikipedia.org/wiki/Pareto-Verteilung";

	/** Logistische Verteilung */
	public static String[] DistLogistic=new String[]{"Logistische Verteilung"};

	/** Wikipedia-Seite Logistische Verteilung */
	public static String DistLogisticWikipedia="https://de.wikipedia.org/wiki/Logistische_Verteilung";

	/** Inverse Gau�-Verteilung */
	public static String[] DistInverseGaussian=new String[]{"Inverse Gau�-Verteilung"};

	/** Wikipedia-Seite Inverse Gau�-Verteilung */
	public static String DistInverseGaussianWikipedia="https://de.wikipedia.org/wiki/Inverse_Normalverteilung";

	/** Rayleigh-Verteilung */
	public static String[] DistRayleigh=new String[]{"Rayleigh-Verteilung"};

	/** Wikipedia-Seite Rayleigh-Verteilung */
	public static String DistRayleighWikipedia="https://de.wikipedia.org/wiki/Rayleigh-Verteilung";

	/** Log-Logistische Verteilung */
	public static String[] DistLogLogistic=new String[]{"Log-Logistische Verteilung"};

	/** Wikipedia-Seite Log-Logistische Verteilung */
	public static String DistLogLogisticWikipedia="https://en.wikipedia.org/wiki/Log-logistic_distribution"; /* Keine deutsche Wikipedia-Seite vorhanden */

	/** Potenzverteilung */
	public static String[] DistPower=new String[]{"Potenzverteilung"};

	/** Wikipedia-Seite Potenzverteilung */
	public static String DistPowerWikipedia="https://en.wikipedia.org/wiki/Pareto_distribution#Inverse-Pareto_Distribution_/_Power_Distribution"; /* Keine deutsche Wikipedia-Seite vorhanden */

	/** Gumbel-Verteilung */
	public static String[] DistGumbel=new String[]{"Gumbel-Verteilung"};

	/** Wikipedia-Seite Gumbel-Verteilung */
	public static String DistGumbelWikipedia="https://de.wikipedia.org/wiki/Gumbel-Verteilung";

	/** Fatigue-Life-Verteilung */
	public static String[] DistFatigueLife=new String[]{"Fatigue-Life-Verteilung"};

	/** Wikipedia-Seite Fatigue-Life-Verteilung */
	public static String DistFatigueLifeWikipedia="https://en.wikipedia.org/wiki/Birnbaum%E2%80%93Saunders_distribution"; /* Keine deutsche Wikipedia-Seite vorhanden */

	/** Frechet-Verteilung */
	public static String[] DistFrechet=new String[]{"Frechet-Verteilung"};

	/** Wikipedia-Seite Frechet-Verteilung */
	public static String DistFrechetWikipedia="https://de.wikipedia.org/wiki/Frechet-Verteilung";

	/** Hyperbolische Sekanten-Verteilung */
	public static String[] DistHyperbolicSecant=new String[]{"Hyperbolische Sekanten-Verteilung"};

	/** Wikipedia-Seite Hyperbolische Sekanten-Verteilung */
	public static String DistHyperbolicSecantWikipedia="https://en.wikipedia.org/wiki/Hyperbolic_secant_distribution"; /* Keine deutsche Wikipedia-Seite vorhanden */

	/** S�gezahnverteilung (links) */
	public static String[] DistSawtoothLeft=new String[]{"Linke S�gezahn-Verteilung"};

	/** Wikipedia-Seite S�gezahnverteilung (links) */
	public static String DistSawtoothLeftWikipedia="https://de.wikipedia.org/wiki/Dreiecksverteilung";

	/** S�gezahnverteilung (rechts) */
	public static String[] DistSawtoothRight=new String[]{"Rechte S�gezahn-Verteilung"};

	/** Wikipedia-Seite S�gezahnverteilung (rechts) */
	public static String DistSawtoothRightWikipedia="https://de.wikipedia.org/wiki/Dreiecksverteilung";

	/** Levy-Verteilung */
	public static String[] DistLevy=new String[]{"Levy-Verteilung"};

	/** Wikipedia-Seite Levy-Verteilung */
	public static String DistLevyWikipedia="https://de.wikipedia.org/wiki/Levy-Verteilung";

	/** Maxwell-Boltzmann-Verteilung */
	public static String[] DistMaxwellBoltzmann=new String[]{"Maxwell-Boltzmann-Verteilung"};

	/** Wikipedia-Seite Maxwell-Boltzmann-Verteilung */
	public static String DistMaxwellBoltzmannWikipedia="https://de.wikipedia.org/wiki/Maxwell-Boltzmann-Verteilung";

	/** Studentsche t-Verteilung */
	public static String[] DistStudentT=new String[] {"Studentsche t-Verteilung"};

	/** Wikipedia-Seite Studentsche t-Verteilung */
	public static String DistStudentTWikipedia="https://de.wikipedia.org/wiki/Studentsche_t-Verteilung";

	/** Hypergeometrische Verteilung */
	public static String[] DistHyperGeom=new String[]{"Hypergeometrische Verteilung"};

	/** Wikipedia-Seite Hypergeometrische Verteilung */
	public static String DistHyperGeomWikipedia="https://de.wikipedia.org/wiki/Hypergeometrische_Verteilung";

	/** Binomialverteilung */
	public static String[] DistBinomial=new String[]{"Binomialverteilung"};

	/** Wikipedia-Seite Binomialverteilung */
	public static String DistBinomialWikipedia="https://de.wikipedia.org/wiki/Binomialverteilung";

	/** Poisson-Verteilung */
	public static String[] DistPoisson=new String[]{"Poisson-Verteilung"};

	/** Wikipedia-Seite Poisson-Verteilung */
	public static String DistPoissonWikipedia="https://de.wikipedia.org/wiki/Poisson-Verteilung";

	/** Negative Binomialverteilung */
	public static String[] DistNegativeBinomial=new String[]{"Negative Binomialverteilung"};

	/** Wikipedia-Seite Negative Binomialverteilung */
	public static String DistNegativeBinomialWikipedia="https://de.wikipedia.org/wiki/Negative_Binomialverteilung";

	/** Zeta-Verteilung */
	public static String[] DistZeta=new String[]{"Zeta-Verteilung"};

	/** Wikipedia-Seite Zeta-Verteilung */
	public static String DistZetaWikipedia="https://de.wikipedia.org/wiki/Zeta-Verteilung";

	/** Diskrete Gleichverteilung */
	public static String[] DistDiscreteUniform=new String[]{"Diskrete Gleichverteilung"};

	/** Wikipedia-Seite Diskrete Gleichverteilung */
	public static String DistDiscreteUniformWikipedia="https://de.wikipedia.org/wiki/Diskrete_Gleichverteilung";

	/** Warnung "unbekannte Verteilung" */
	public static String DistUnknown="unbekannte Verteilung";

	/** Empirische Verteilung - "Datenpunkt" */
	public static String DistDataPoint="Datenpunkt";

	/** Empirische Verteilung - "Datenpunkte" */
	public static String DistDataPoints="Datenpunkte";

	/** Bezeichner "Bereich" */
	public static String DistRange="Bereich";

	/** Bezeichner "Lage" */
	public static String DistLocation="Lage";

	/** Bezeichner "Skalierung" */
	public static String DistScale="Skalierung";

	/** Bezeichner "Am wahrscheinlichsten" (f�r Dreiecksverteilung) */
	public static String DistMostLikely="Am wahrscheinlichsten";

	/** Bezeichner "Freiheitsgrade" */
	public static String DistDegreesOfFreedom="Freiheitsgrade";

	/** Bezeichner "Mittelwert" */
	public static String DistMean="Mittelwert";

	/** Bezeichner "Standardabweichung" */
	public static String DistStdDev="Standardabweichung";

	/** Bezeichner "Variationskoeffizient" */
	public static String DistCV="Variationskoeffizient";

	/** Bezeichner "Schiefe" */
	public static String DistSkewness="Schiefe";

	/** Bezeichner "Modus" */
	public static String DistMode="Modus";

	/** Bezeichner "Parameter" */
	public static String DistParameter="Parameter";

	/**
	 * Diese Klasse kann nicht instanziert werden.
	 */
	private DistributionTools() {
	}

	/**
	 * Statische Liste mit den verf�gbaren Verteilungs-Wrappern
	 * @see AbstractDistributionWrapper
	 */
	private static final AbstractDistributionWrapper[] wrappers;

	static {
		wrappers=new AbstractDistributionWrapper[] {
				new WrapperDataDistribution(),
				new WrapperNeverDistribution(), /* Versteckt in der Liste */
				new WrapperOnePointDistribution(),
				new WrapperUniformRealDistribution(),
				new WrapperExponentialDistribution(),
				new WrapperNormalDistribution(),
				new WrapperLogNormalDistribution(),
				new WrapperErlangDistribution(),
				new WrapperGammaDistribution(),
				new WrapperBetaDistribution(),
				new WrapperCauchyDistribution(),
				new WrapperWeibullDistribution(),
				new WrapperChiSquaredDistribution(),
				new WrapperChiDistribution(),
				new WrapperFDistribution(),
				new WrapperJohnsonDistribution(),
				new WrapperTriangularDistribution(),
				new WrapperPertDistribution(),
				new WrapperLaplaceDistribution(),
				new WrapperParetoDistribution(),
				new WrapperLogisticDistribution(),
				new WrapperInverseGaussianDistribution(),
				new WrapperRayleighDistribution(),
				new WrapperLogLogisticDistribution(),
				new WrapperPowerDistribution(),
				new WrapperGumbelDistribution(),
				new WrapperFatigueLifeDistribution(),
				new WrapperFrechetDistribution(),
				new WrapperHyperbolicSecantDistribution(),
				new WrapperSawtoothLeftDistribution(),
				new WrapperSawtoothRightDistribution(),
				new WrapperLevyDistribution(),
				new WrapperMaxwellBoltzmannDistribution(),
				new WrapperStudentTDistribution(),
				new WrapperHyperGeomDistribution(),
				new WrapperBinomialDistribution(),
				new WrapperPoissonDistribution(),
				new WrapperNegativeBinomialDistribution(),
				new WrapperZetaDistribution(),
				new WrapperDiscreteUniformDistribution()
		};
	}

	/**
	 * Liefert einen Wrapper f�r einen gegebenen Verteilungsnamen
	 * @param name	Name f�r der die Wrapperklasse bestimmt werden soll
	 * @return	Passender Wrapper oder <code>null</code> wenn f�r den Namen kein Wrapper vorhanden ist
	 */
	public static AbstractDistributionWrapper getWrapper(final String name) {
		for (AbstractDistributionWrapper wrapper: wrappers) if (wrapper.isForDistribution(name)) return wrapper;
		return null;
	}

	/**
	 * Liefert einen Wrapper f�r eine gegebenen Verteilung
	 * @param distribution	Verteilung f�r die der zugeh�rige Wrapper bestimmt werden soll
	 * @return	Passender Wrapper oder <code>null</code> wenn f�r die Verteilungsklasse kein Wrapper vorhanden ist
	 */
	public static AbstractDistributionWrapper getWrapper(final AbstractRealDistribution distribution) {
		if (distribution==null) return null;
		for (AbstractDistributionWrapper wrapper: wrappers) if (wrapper.isForDistribution(distribution)) return wrapper;
		return null;
	}

	/**
	 * Auflistung der Namen aller unterst�tzten Verteilungen
	 * @return Liste der unterst�tzten Verteilungen
	 */
	public static String[] getDistributionNames() {
		return Stream.of(wrappers).filter(wrapper->!wrapper.isHiddenInNamesList()).map(wrapper->wrapper.getName()).toArray(String[]::new);
	}

	/**
	 * Versucht aus einem angegebenen Verteilungsnamen und Mittelwert und Standardabweichung eine Verteilung zu erstellen.
	 * @param name	Name der Verteilung
	 * @param mean	Mittelwert
	 * @param sd	Standardabweichung
	 * @return	Verteilungsobjekt oder <code>null</code> wenn aus den Daten keine Verteilung erstellt werden konnte
	 */
	public static AbstractRealDistribution getDistributionFromInfo(final String name, final double mean, final double sd) {
		final AbstractDistributionWrapper wrapper=getWrapper(name);
		if (wrapper!=null) return wrapper.getDistribution(mean,sd);
		return null;
	}

	/**
	 * Liefert ein Vorschaubild f�r eine Verteilung
	 * @param name	Name der Verteilung (gem�� <code>getDistributionNames</code> f�r das ein Vorschaubild geliefert werden soll.
	 * @return	Vorschaubild in 50x25 Pixeln Aufl�sung f�r die angegebene Verteilung oder <code>null</code>, wenn kein Vorschaubild vorhanden ist.
	 * @see DistributionTools#getDistributionName(AbstractRealDistribution)
	 */
	public static ImageIcon getThumbnailImageForDistributionName(final String name) {
		final AbstractDistributionWrapper wrapper=getWrapper(name);
		if (wrapper!=null) return wrapper.getThumbnailImage();
		return null;
	}

	/**
	 * Liefert den Namen einer Verteilung
	 * @param distribution Verteilungsobjekt, von dem der Name zur�ck gegeben werden soll.
	 * @return Name der Verteilung als String
	 */
	public static String getDistributionName(final AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.getName();
		return DistUnknown;
	}

	/**
	 * Liefert die wesentlichen Kenngr��en bzw. Parameter einer Verteilung
	 * @param distribution Verteilungsobjekt, zu dem Informationen zur�ck gegeben werden sollen.
	 * @return Informationen zu der Verteilung als String
	 */
	public static String getDistributionShortInfo(final AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper==null) return "";
		return wrapper.getInfo(distribution).getVeryShortInfo();
	}

	/**
	 * Liefert die Kenngr��en bzw. Parameter einer Verteilung
	 * @param distribution Verteilungsobjekt, zu dem Informationen zur�ck gegeben werden sollen.
	 * @return Informationen zu der Verteilung als String
	 */
	public static String getDistributionInfo(final AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper==null) return "";
		return wrapper.getInfo(distribution).getShortInfo();
	}

	/**
	 * Liefert die Kenngr��en bzw. Parameter einer Verteilung (in ausgeschriebener Form)
	 * @param distribution Verteilungsobjekt, zu dem Informationen zur�ck gegeben werden sollen.
	 * @return Informationen zu der Verteilung als String
	 */
	public static String getDistributionLongInfo(final AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper==null) return "";
		return wrapper.getInfo(distribution).getLongInfo();
	}

	/**
	 * Liefert den Link zur Wikipedia-Seite zu einer Verteilung.
	 * @param distribution Verteilungsobjekt, zu dem der Wikipedia-Link geliefert werden soll
	 * @return	URL zur Wikipedia-Seite zu der Verteilung (oder <code>null</code>, wenn keine passende Adresse vorliegt)
	 */
	public static URI getDistributionWikipediaLink(final AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper==null) return null;
		String url=wrapper.getWikipediaURL();
		if (url==null || url.trim().isEmpty()) return null;
		try {
			return new URI(url);
		} catch (URISyntaxException e) {
			return null;
		}
	}

	/**
	 * Liefert den Mittelwert der �bergebenen Verteilung
	 * @param distribution Verteilungsobjekt, von dem der Mittelwert bestimmt werden soll
	 * @return Mittelwert der Verteilung
	 */
	public static double getMean(final AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.getMean(distribution);
		return 0.0;
	}

	/**
	 * Gibt an, ob mit der <code>setMean</code>-Funktion ein neuer Mittelwert eingestellt werden kann
	 * @param distribution	Zu pr�fende Verteilung
	 * @return	Gibt <code>true</code> zur�ck, wenn der Mittelwert direkt eingestellt werden kann
	 * @see DistributionTools#setMean(AbstractRealDistribution, double)
	 * @see DistributionTools#canSetMeanExact(AbstractRealDistribution)
	 */
	public static boolean canSetMean(final AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.canSetMean;
		return false;
	}

	/**
	 * Gibt an, ob der Mittelwert ganz exakt eingestellt werden kann.
	 * Liefert {@link DistributionTools#canSetMean(AbstractRealDistribution)} zwar <code>true</code>
	 * aber diese Methode <code>false</code>, so kann der Mittelwert zwar eingestellt werden,
	 * aber da z.B. bestimmte Verteilungsparameter Ganzzahlen sein m�ssen, nicht absolut exakt.
	 * @param distribution	Zu pr�fende Verteilung
	 * @return	Gibt <code>true</code> zur�ck, wenn der Mittelwert direkt exakt eingestellt werden kann
	 * @see DistributionTools#setMean(AbstractRealDistribution, double)
	 * @see DistributionTools#canSetMean(AbstractRealDistribution)
	 */
	public static boolean canSetMeanExact(final AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.canSetMeanExact;
		return false;
	}

	/**
	 * Erstellt eine neue Verteilung als Kopie der �bergebenen mit angepasstem Erwartungswert
	 * @param distribution	Alte Verteilung, auf der die neue basieren soll
	 * @param value	Neuer Erwartungswert
	 * @return	Liefert im Erfolgsfall die neue Verteilung; wenn eine Anpassung nicht m�glich war, <code>null</code>
	 * @see DistributionTools#canSetMean(AbstractRealDistribution)
	 */
	public static AbstractRealDistribution setMean(final AbstractRealDistribution distribution, final double value) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.setMean(distribution,value);
		return null;
	}

	/**
	 * Liefert die Standardabweichung der �bergebenen Verteilung
	 * @param distribution Verteilungsobjekt, von dem die Standardabweichung bestimmt werden soll
	 * @return Standardabweichung der Verteilung
	 */
	public static double getStandardDeviation(final AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.getStandardDeviation(distribution);
		return 0.0;
	}

	/**
	 * Gibt an, ob mit der <code>setStandardDeviation</code>-Funktion eine neue Standardabweichung eingestellt werden kann
	 * @param distribution	Zu pr�fende Verteilung
	 * @return	Gibt <code>true</code> zur�ck, wenn die Standardabweichung direkt eingestellt werden kann
	 * @see DistributionTools#setStandardDeviation(AbstractRealDistribution, double)
	 */
	public static boolean canSetStandardDeviation(final AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.canSetStandardDeviation;
		return false;
	}

	/**
	 * Gibt an, ob die Standardabweichung ganz exakt eingestellt werden kann.
	 * Liefert {@link DistributionTools#canSetStandardDeviation(AbstractRealDistribution)} zwar <code>true</code>
	 * aber diese Methode <code>false</code>, so kann die Standardabweichung zwar eingestellt werden,
	 * aber da z.B. bestimmte Verteilungsparameter Ganzzahlen sein m�ssen, nicht absolut exakt.
	 * @param distribution	Zu pr�fende Verteilung
	 * @return	Gibt <code>true</code> zur�ck, wenn die Standardabweichung direkt exakt eingestellt werden kann
	 * @see DistributionTools#setStandardDeviation(AbstractRealDistribution, double)
	 * @see DistributionTools#canSetStandardDeviation(AbstractRealDistribution)
	 */
	public static boolean canSetStandardDeviationExact(final AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.canSetStandardDeviationExact;
		return false;
	}

	/**
	 * Erstellt eine neue Verteilung als Kopie der �bergebenen mit angepasster Standardabweichung
	 * @param distribution	Alte Verteilung, auf der die neue basieren soll
	 * @param value	Neue Standardabweichung
	 * @return	Liefert im Erfolgsfall die neue Verteilung; wenn eine Anpassung nicht m�glich war, <code>null</code>
	 * @see DistributionTools#canSetStandardDeviation(AbstractRealDistribution)
	 */
	public static AbstractRealDistribution setStandardDeviation(final AbstractRealDistribution distribution, final double value) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.setStandardDeviation(distribution,value);
		return null;
	}

	/**
	 * Liefert den Wert eines Parameters einer Wahrscheinlichkeitsverteilung
	 * @param distribution	Wahrscheinlichkeitsverteilung, von der ein Parameter ausgelesen werden soll
	 * @param nr	Nummer des Parameters (1-4)
	 * @return	Wert des Parameters
	 */
	public static double getParameter(final AbstractRealDistribution distribution, final int nr) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.getParameter(distribution,nr);
		return 0.0;
	}

	/**
	 * Stellt den Wert eines Parameters einer Wahrscheinlichkeitsverteilung ein
	 * @param distribution	Wahrscheinlichkeitsverteilung, bei der ein Parameter eingestellt werden soll
	 * @param nr	Nummer des Parameters (1-4)
	 * @param value	Neuer Wert des Parameters
	 * @return	Neue Verteilung mit ver�ndertem Parameter
	 */
	public static AbstractRealDistribution setParameter(final AbstractRealDistribution distribution, final int nr, final double value) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.setParameter(distribution,nr,value);
		return null;
	}

	/**
	 * Liefert den Variationskoeffizient der �bergebenen Verteilung
	 * @param distribution Verteilungsobjekt, von dem der Veriationskoeffizient bestimmt werden soll
	 * @return Variationskoeffizient der Verteilung
	 */
	public static double getCV(final AbstractRealDistribution distribution) {
		final double sd=getStandardDeviation(distribution);
		if (sd==0) return 0;
		final double mean=getMean(distribution);
		if (mean==0) return 0;
		return sd/Math.abs(mean);
	}

	/**
	 * Wandelt die �bergebene Verteilung in eine Zeichenkette um
	 * @param distribution	Umzuwandelndes Verteilungsobjekt
	 * @return	Verteilungsname und Parameter als Zeichenkette
	 * @see DistributionTools#distributionFromString(String, double)
	 */
	public static String distributionToString(AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.toString(distribution);
		return DistributionTools.getDistributionName(distribution);
	}

	/**
	 * Maximal zul�ssige Abweichung zwischen zwei Parametern, bei denen zwei Werte noch als identisch angenommen werden.
	 * @see AbstractDistributionWrapper#compareInt(AbstractRealDistribution, AbstractRealDistribution)
	 */
	public static final double MAX_ERROR=10E-12;

	/**
	 * Vergleicht zu Verteilungen und liefert <code>true</code> zur�ck, wenn Sie inhaltlich identisch sind.
	 * @param distribution1 Erste zu vergleichende Verteilung
	 * @param distribution2 Zweite zu vergleichende Verteilung
	 * @return Liefert <code>true</code> zur�ck, wenn die Daten der beiden Verteilungen identisch sind.
	 */
	public static boolean compare(final AbstractRealDistribution distribution1, final AbstractRealDistribution distribution2) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution1);
		if (wrapper!=null) return wrapper.compare(distribution1,distribution2);
		return distributionToString(distribution1).equals(distributionToString(distribution2));
	}

	/**
	 * L�dt eine kontinuierliche Verteilung aus einer Zeichenkette
	 * @param data Zeichenkette, die die Verteilungsdaten enth�lt (mit <code>distributionToString</code> zu erzeugen)
	 * @param maxXValue	Obere Grenze f�r den Tr�ger der Dichte (wenn es sich um eine empirische Verteilung handelt)
	 * @return Liefert ein Verteilungsobjekt zur�ck, wenn die Verteilung erfolgreich geladen werden konnte; andernfalls wird <code>null</code> zur�ckgegeben.
	 * @see DistributionTools#distributionToString(AbstractRealDistribution)
	 */
	public static AbstractRealDistribution distributionFromString(final String data, final double maxXValue) {
		if (data==null) return null;

		/* Just values... */
		if (data.indexOf(';')>=0) {
			DataDistributionImpl dist=DataDistributionImpl.createFromString(data,maxXValue);
			if (dist!=null) return dist;
		}

		/* NeverDistributionImpl */
		for (String s: DistInfinite) if (data.equalsIgnoreCase(s)) return new NeverDistributionImpl();
		for (String s: DistNever) if (data.equalsIgnoreCase(s)) return new NeverDistributionImpl();

		/* Split "Name (Param)" */
		final int i=data.indexOf('(');
		if (i>=0) {
			final String name=data.substring(0,i).trim();
			String param=data.substring(i+1);
			if (param.endsWith(")")) param=param.substring(0,param.length()-1);
			param=param.trim();
			if (name.isEmpty() || param.isEmpty()) return null;

			final AbstractDistributionWrapper wrapper=getWrapper(name);
			if (wrapper!=null) return wrapper.fromString(param,maxXValue);
		}

		/* Just one value */
		final Double D=NumberTools.getDouble(data);
		if (D!=null) {
			DataDistributionImpl dist=DataDistributionImpl.createFromString(data,maxXValue);
			if (dist!=null) return dist;
		}

		return null;
	}

	/**
	 * Erstellt eine Kopie eines {@link AbstractRealDistribution}-Objektes
	 * @param distribution	Zu kopierende Verteilung
	 * @return	Kopiertes Verteilungsobjekt
	 */
	public static AbstractRealDistribution cloneDistribution(final AbstractRealDistribution distribution) {
		final AbstractDistributionWrapper wrapper=getWrapper(distribution);
		if (wrapper!=null) return wrapper.clone(distribution);
		return null;
	}

	/**
	 * Erstellt eine Kopie eines {@link AbstractRealDistribution}-Objektes und normalisiert bei
	 * diesem die Raten zu einer Dichte, sofern es sich um ein {@link DataDistributionImpl}-Objekt handelt.
	 * @param distribution	Zu kopierende Verteilung
	 * @return	Kopiertes Verteilungsobjekt
	 */
	public static AbstractRealDistribution cloneAndNormalizeDistribution(final AbstractRealDistribution distribution) {
		final AbstractRealDistribution cloned=cloneDistribution(distribution);
		if (cloned instanceof DataDistributionImpl) ((DataDistributionImpl)cloned).normalizeDensity();
		return cloned;
	}

	/**
	 * Sofern es sich bei dem Parameter um ein {@link DataDistributionImpl}-Objekt handelt, werden
	 * bei einer Kopie von diesem die Raten zu einer Dichte normalisiert und die Kopie wird zur�ckgegeben.
	 * Andernfalls wird einfach das im Parameter �bergebene Verteilungsobjekt selbst zur�ckgegeben.
	 * @param distribution	Verteilung die ggf. zu normalisieren ist
	 * @return	Kopie oder Originalobjekt
	 */
	public static AbstractRealDistribution normalizeDistribution(final AbstractRealDistribution distribution) {
		if (distribution instanceof DataDistributionImpl) {
			final DataDistributionImpl clonedData=((DataDistributionImpl)distribution).clone();
			clonedData.normalizeDensity();
			return clonedData;
		}
		return distribution;
	}
}