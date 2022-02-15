package com.karazina.gaussMethod.method;

import com.karazina.gaussMethod.utils.GaussMethodUtils;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class GaussMethodTest {

    @DisplayName("Started test")
    @Test
    void test1() {
        GaussMethodUtils.setCoefficients(new double[][]{
                {1, 1, 1},
                {1, -1, 2},
                {2, -1, -1}
        });
        GaussMethodUtils.setValues(new double[]{6, 5, -3});
        GaussMethod gaussMethod = new GaussMethod(GaussMethodUtils.getCoefficients(), GaussMethodUtils.getValues());
        gaussMethod.count();
        double[] actualArguments = gaussMethod.getArguments();
        double[] expectedArguments = {1, 2, 3};
        Assert.assertArrayEquals(expectedArguments, actualArguments, 0);
    }

    @DisplayName("Variant 12")
    @Test
    void variant12_test() {
        GaussMethodUtils.setCoefficients(new double[][]{
                {1.11, -4.83, 2.15},
                {1.75, 2.16, -5.01},
                {2.43, 5.52, -3.39}
        });
        GaussMethodUtils.setValues(new double[]{-5.01, 2.25, 5.21});
        GaussMethod gaussMethod = new GaussMethod(GaussMethodUtils.getCoefficients(), GaussMethodUtils.getValues());
        gaussMethod.count();
        double[] actualArguments = gaussMethod.getArguments();
        double[] expectedArguments = {-0.16281390661062908, 0.9585916274336148, -0.09268790844550771};
        Assert.assertArrayEquals(expectedArguments, actualArguments, 0);
    }

    @DisplayName("Variant 28")
    @Test
    void variant28_test() {
        GaussMethodUtils.setCoefficients(new double[][]{
                {1.24, -2.37, 3.48},
                {0.76, 4.21, -2.25},
                {8.84, 0.96, 5.27}
        });
        GaussMethodUtils.setValues(new double[]{-3.17, 2.44, 3.06});
        GaussMethod gaussMethod = new GaussMethod(GaussMethodUtils.getCoefficients(), GaussMethodUtils.getValues());
        gaussMethod.count();
        double[] actualArguments = gaussMethod.getArguments();
        double[] expectedArguments = {1.6702839312848305, -0.8283655934823737, -2.0702237159041426};
        Assert.assertArrayEquals(expectedArguments, actualArguments, 0);
    }

    @DisplayName("Variant 29")
    @Test
    void variant29_test() {
        GaussMethodUtils.setCoefficients(new double[][]{
                {6.21, -4.52, 5.16},
                {-7.49, 5.34, -4.16},
                {4.15, -9.48, 9.20}
        });
        GaussMethodUtils.setValues(new double[]{5.24, -5.86, 1.71});
        GaussMethod gaussMethod = new GaussMethod(GaussMethodUtils.getCoefficients(), GaussMethodUtils.getValues());
        gaussMethod.count();
        double[] actualArguments = gaussMethod.getArguments();
        double[] expectedArguments = {1.0, 0.5, 0.25};
        Assert.assertArrayEquals(expectedArguments, actualArguments, 0);
    }

    @DisplayName("Variant 30")
    @Test
    void variant30_test() {
        GaussMethodUtils.setCoefficients(new double[][]{
                {4.42, 12.64, 5.77},
                {0.16, 3.82, 6.41},
                {-7.14, 4.98, 8.73}
        });
        GaussMethodUtils.setValues(new double[]{1.56, 4.42, -2.67});
        GaussMethod gaussMethod = new GaussMethod(GaussMethodUtils.getCoefficients(), GaussMethodUtils.getValues());
        gaussMethod.count();
        double[] actualArguments = gaussMethod.getArguments();
        double[] expectedArguments = {1.205913102373842, -0.823259561943077, 1.1500632496478531};
        Assert.assertArrayEquals(expectedArguments, actualArguments, 0);
    }

}
