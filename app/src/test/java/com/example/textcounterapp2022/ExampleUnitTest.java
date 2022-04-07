package com.example.textcounterapp2022;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.textcounterapp2022.utils.TextUtils;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void getCharsCount_Given_EmptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextUtils.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_Given_TenCharsString_Result_Ten() {
        String givenString = "0123456789";
        int expectedValue = 10;
        int actualValue = TextUtils.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test(expected = NullPointerException.class)
    public void getCharsCount_Given_NullString_Result_Exception() {
        String givenString = null;
        int actualValue = TextUtils.getCharsCount(givenString);
    }
    @Test
    public void getCharsCount_Given_SpacesString_Result_Three() {
        String givenString = "   ";
        int expectedValue = 3;
        int actualValue = TextUtils.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_Given_NormalString_Result_Twelve() {
        String givenString = "Good morning";
        int expectedValue = 12;
        int actualValue = TextUtils.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_Given_SymbolString_Result_Seven() {
        String givenString = "+-?%.,^";
        int expectedValue = 7;
        int actualValue = TextUtils.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_EmptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_Given_TenCharsString_Result_Ten() {
        String givenString = "0123456789";
        int expectedValue = 10;
        int actualValue = TextUtils.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test(expected = NullPointerException.class)
    public void getWordsCount_Given_NullString_Result_Exception() {
        String givenString = null;
        int actualValue = TextUtils.getWordsCount(givenString);
    }
    @Test
    public void getWordsCount_Given_SpacesString_Result_Three() {
        String givenString = "   ";
        int expectedValue = 3;
        int actualValue = TextUtils.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_Given_NormalString_Result_Twelve() {
        String givenString = "Good morning";
        int expectedValue = 12;
        int actualValue = TextUtils.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_Given_SymbolString_Result_Seven() {
        String givenString = "+-?%.,^";
        int expectedValue = 7;
        int actualValue = TextUtils.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
}