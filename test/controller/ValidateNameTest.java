package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateNameTest {
	
	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"Nguyen Minh Hieu,true",
		"@!asd,false",
		"1muitentrung2connhan,false",
		"'',false"
	})
	void test(String name, boolean expected) {
		boolean isValidated = placeOrderController.validateName(name);
		assertEquals(expected, isValidated);
	}

}
