package io.hithub.censodev.utc.dataminingtest;

import io.github.censodev.utc.dataminingtest.App;
import io.github.censodev.utc.dataminingtest.IApp;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

class AppTest {
    String filename = "data.txt";
    Path path = Paths.get(Objects.requireNonNull(getClass().getClassLoader()
                .getResource(filename)).toURI());
    IApp app = new App(path);

    public AppTest() throws URISyntaxException, IOException {
    }

    @Test
    void testMeanMediumMode() {
        app.runCalcMeanMediumModeJob();
    }

    @Test
    void testDrawBoxplot() {
        app.runDrawBoxplotJob();
    }

    @Test
    void testNormalizeMinMax() {
        app.runNormalizeMinMaxJob(0, 1);
    }

    @Test
    void testNormalizeZScore() {
        app.runNormalizeZScoreJob();
    }

    @Test
    void testNormalizeZScoreMeanAbsDeviation() {
        app.runNormalizeZScoreMeanAbsDeviationJob();
    }

    @Test
    void testNormalizeDecimalScaling() {
        app.runNormalizeDecimalScalingJob();
    }

    @Test
    void testCalcCorrelationCoefficient() {
        app.runCalcCorrelationCoefficientJob();
    }

    @Test
    void testSmoothDataByEqualWidthBinning() {
        app.runSmoothDataByEqualWidthBinningJob(3);
    }

    @Test
    void testSmoothDataByEqualFrequencyBinning() {
        app.runSmoothDataByEqualFrequencyBinningJob(3);
    }
}
