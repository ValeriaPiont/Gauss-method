package com.karazina.gaussMethod.app;

import com.karazina.gaussMethod.method.GaussMethod;
import com.karazina.gaussMethod.utils.GaussMethodUtils;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        GaussMethodUtils.read("src/main/resources/matrix.file");
        GaussMethod method = new GaussMethod(GaussMethodUtils.getCoefficients(), GaussMethodUtils.getValues());
        method.count();
        double[] arguments = method.getArguments();
        GaussMethodUtils.writeArguments(arguments);
    }

}
