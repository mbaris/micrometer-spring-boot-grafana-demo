package io.baris.metrics.metricsdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class MetricsDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetricsDemoAppApplication.class, args);
	}

}
