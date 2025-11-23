package com.mzap.eurekaserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class EurekaServerApplicationTests {

    @Test
    void startsApplicationWithoutException() {
        assertDoesNotThrow(() -> EurekaServerApplication.main(new String[]{}));
    }


}
