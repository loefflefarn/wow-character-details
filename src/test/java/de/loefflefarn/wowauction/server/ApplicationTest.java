package de.loefflefarn.wowauction.server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(classes = Application.class, webEnvironment = RANDOM_PORT)
class ApplicationTest {
    @Value("${application.name}")
    private String applicationName;

    @Value("${application.version}")
    private String applicationVersion;

    @Test
    void testMain() {
        assertThat(applicationName).isEqualTo("wowauction-server");
        assertThat(applicationVersion).isEqualTo("0.1.0");
    }
}
