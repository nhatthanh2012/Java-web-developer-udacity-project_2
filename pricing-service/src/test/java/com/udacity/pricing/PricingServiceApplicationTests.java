package com.udacity.pricing;

import com.udacity.pricing.domain.price.Price;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.udacity.pricing.domain.price.PriceRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PricingServiceApplicationTests {

	@MockBean
	private PriceRepository priceRepository;
	@Test
	public void contextLoads() {
	}

	/**
	 * Created by ThanhTLN - 20231025.
	 * Description: test price empty
	 */
	@Test
	public void testEmptyPrice() {
		when(priceRepository.findById(9799L)).thenReturn(Optional.empty());
		// compare result
		assertEquals(Optional.empty(), priceRepository.findById(9799L));
	}
}
