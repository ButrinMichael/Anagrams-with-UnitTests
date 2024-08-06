package ua.foxminded.anagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class AnagramsTest {

	Anagrams anagram = new Anagrams();

	@Test
	void reverseStringSentence_shouldReturn_whenInputString() {
		Assertions.assertEquals("d1cba hgf!e", anagram.reverseStringSentence("a1bcd efg!h"));
	}

	@Test
	void reverseStringSentence1_shouldReturn_whenInputString() {
		Assertions.assertEquals("@3MI9#SH@A @!O$K#@k", anagram.reverseStringSentence("@3AH9#SI@M @!k$K#@O"));
	}

	@Test
	void reverseStringSentence_shouldReturnedThreWordWithOneSpaceBetwen_whenInputThreStringwordWithMultiSpaces() {
		Assertions.assertEquals("BJK@#JKKBK@ @#KJH@#   @OI#O",
				anagram.reverseStringSentence("KBK@#KJKJB@ @#HJK@#   @OI#O"));
	}

	@Test
	void reverseStringSentence_shouldReturnedForWordWithSameSpaceBetwen_whenInputThreStringwordWithMultiSpaces() {
		Assertions.assertEquals("BJK@#JKKBK@ @#KJH@#   @OI#O  sahfdlsagdis",
				anagram.reverseStringSentence("KBK@#KJKJB@ @#HJK@#   @OI#O  sidgasldfhas"));
	}

	@Test
	void reverseStringSentence_shouldReturnnull_whenInputStringContainsOnlySpaces() {
		Assertions.assertEquals("", anagram.reverseStringSentence("   "));
	}

	@Test
	void reverseStringSentence_shouldReturnnull_whenInputStringContainsOneSpaces() {
		Assertions.assertEquals("", anagram.reverseStringSentence(" "));
	}

	@Test
	void reverseStringSentence_shouldReturMultiplySpace_whenMultiplySpaceBetwenWordInput() {
		Assertions.assertEquals("d1cba        hgf!e", anagram.reverseStringSentence("a1bcd        efg!h"));
	}

	@Test
	void reverseStringSentence_shouldReturnInput_whenSingleCharacterInput() {
		Assertions.assertEquals("A", anagram.reverseStringSentence("A"));
	}

	@Test
	void reverseStringSentence_shouldReturnInput_whenMultipleSameLetterInputt() {
		Assertions.assertEquals("AAAAAAAA", anagram.reverseStringSentence("AAAAAAAA"));
	}

	@Test
	void reverseStringSentence_shouldReturnUpperThenLower_whenSameCharacterInLowerAndUpperCasesrInputt() {
		Assertions.assertEquals("AAAAAAAAaaaaaa", anagram.reverseStringSentence("aaaaaaAAAAAAAA"));
	}

	@Test
	void reverseStringSentence_shouldReturnSameInputr_whenOnlySymbolInput() {
		Assertions.assertEquals("!@#$%^&*()", anagram.reverseStringSentence("!@#$%^&*()"));
	}

	@Test
	void reverseStringSentence_shouldReturnSameInputr_whenOnlyNumbersInput() {
		Assertions.assertEquals("1234567890", anagram.reverseStringSentence("1234567890"));
	}

	@Test
	void reverseStringSentence_shouldThrowIllegalArgumentException_whenInputStringIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			anagram.reverseStringSentence(null);
		});
	}

	@Test
	void reverseStringSentence_shouldThrowIllegalArgumentException_whenInputStringIsNothing() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			anagram.reverseStringSentence("");
		});
	}

}
