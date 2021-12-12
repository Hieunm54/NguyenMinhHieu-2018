package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateNameRushOrderTest {
	
	private PlaceRushOrderController placeRushOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		"Nguyen Minh Hieu,true",
		"@ABC,false",
		"1abc12,false",
		"'',false"
	})
	void test(String name, boolean expected) {
		boolean isValidated = placeRushOrderController.validateName(name);
		assertEquals(expected, isValidated);
	}

}
