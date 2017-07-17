/**
 * Created by admin on 10/26/2015.
 */

import weka.classifiers.Classifier;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;

public class WekaWrapper
        extends Classifier {

    /**
     * Returns only the toString() method.
     *
     * @return a string describing the classifier
     */
    public String globalInfo() {
        return toString();
    }

    /**
     * Returns the capabilities of this classifier.
     *
     * @return the capabilities
     */
    public Capabilities getCapabilities() {
        Capabilities result = new Capabilities(this);

        result.enable(Capabilities.Capability.NOMINAL_ATTRIBUTES);
        result.enable(Capabilities.Capability.NUMERIC_ATTRIBUTES);
        result.enable(Capabilities.Capability.DATE_ATTRIBUTES);
        result.enable(Capabilities.Capability.MISSING_VALUES);
        result.enable(Capabilities.Capability.NOMINAL_CLASS);
        result.enable(Capabilities.Capability.MISSING_CLASS_VALUES);

        result.setMinimumNumberInstances(0);

        return result;
    }

    /**
     * only checks the data against its capabilities.
     *
     * @param i the training data
     */
    public void buildClassifier(Instances i) throws Exception {
        // can classifier handle the data?
        getCapabilities().testWithFail(i);
    }

    /**
     * Classifies the given instance.
     *
     * @param i the instance to classify
     * @return the classification result
     */
    public double classifyInstance(Instance i) throws Exception {
        Object[] s = new Object[i.numAttributes()];

        for (int j = 0; j < s.length; j++) {
            if (!i.isMissing(j)) {
                if (i.attribute(j).isNominal())
                    s[j] = new String(i.stringValue(j));
                else if (i.attribute(j).isNumeric())
                    s[j] = new Double(i.value(j));
            }
        }

        // set class value to missing
        s[i.classIndex()] = null;

        return WekaClassifier.classify(s);
    }

    @Override
    public double[] distributionForInstance(Instance instance) throws Exception {
        return new double[0];
    }

    /**
     * Returns the revision string.
     *
     * @return        the revision
     */
    public String getRevision() {
        return RevisionUtils.extract("1.0");
    }

    /**
     * Returns only the classnames and what classifier it is based on.
     *
     * @return a short description
     */
    public String toString() {
        return "Auto-generated classifier wrapper, based on weka.classifiers.trees.J48 (generated with Weka 3.6.9).\n" + this.getClass().getName() + "/WekaClassifier";
    }

    /**
     * Runs the classfier from commandline.
     *
     * @param args the commandline arguments
     */
    public static void main(String args[]) {
        runClassifier(new WekaWrapper(), args);
    }

    private static void runClassifier(WekaWrapper wekaWrapper, String[] args) {
    }
}

class WekaClassifier {

    public static double classify(Object[] i)
            throws Exception {

        double p = Double.NaN;
        p = WekaClassifier.N7db1592b0(i);
        return p;
    }
    static double N7db1592b0(Object[]i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 2.0) {
            p = WekaClassifier.N65556851(i);
        } else if (((Double) i[1]).doubleValue() > 2.0) {
            p = WekaClassifier.N5aff0e4c5(i);
        }
        return p;
    }
    static double N65556851(Object[]i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 3.0) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > 3.0) {
            p = WekaClassifier.N4ca339022(i);
        }
        return p;
    }
    static double N4ca339022(Object[]i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 3.0) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 3.0) {
            p = WekaClassifier.N6ff3d99c3(i);
        }
        return p;
    }
    static double N6ff3d99c3(Object[]i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 2.0) {
            p = WekaClassifier.N7253ca2f4(i);
        } else if (((Double) i[6]).doubleValue() > 2.0) {
            p = 1;
        }
        return p;
    }
    static double N7253ca2f4(Object[]i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 3.0) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 3.0) {
            p = 0;
        }
        return p;
    }
    static double N5aff0e4c5(Object[]i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 2.0) {
            p = WekaClassifier.N1f03ce406(i);
        } else if (((Double) i[2]).doubleValue() > 2.0) {
            p = WekaClassifier.N32d9dba87(i);
        }
        return p;
    }
    static double N1f03ce406(Object[]i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 5.0) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 5.0) {
            p = 1;
        }
        return p;
    }
    static double N32d9dba87(Object[]i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 4.0) {
            p = WekaClassifier.N7ce40cac8(i);
        } else if (((Double) i[1]).doubleValue() > 4.0) {
            p = 1;
        }
        return p;
    }
    static double N7ce40cac8(Object[]i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 2.0) {
            p = WekaClassifier.N5ffc30429(i);
        } else if (((Double) i[5]).doubleValue() > 2.0) {
            p = WekaClassifier.N25c46e4910(i);
        }
        return p;
    }
    static double N5ffc30429(Object[]i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 3.0) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > 3.0) {
            p = 1;
        }
        return p;
    }
    static double N25c46e4910(Object[]i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 6.0) {
            p = WekaClassifier.N3248dfe11(i);
        } else if (((Double) i[0]).doubleValue() > 6.0) {
            p = 1;
        }
        return p;
    }
    static double N3248dfe11(Object[]i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 3.0) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 3.0) {
            p = WekaClassifier.N54e6204e12(i);
        }
        return p;
    }
    static double N54e6204e12(Object[]i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 5.0) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > 5.0) {
            p = 1;
        }
        return p;
    }
}