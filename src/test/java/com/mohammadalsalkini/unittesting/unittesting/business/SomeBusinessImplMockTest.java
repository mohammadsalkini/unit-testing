package com.mohammadalsalkini.unittesting.unittesting.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

    @InjectMocks
    SomeBusinessImpl business = new SomeBusinessImpl();

    @Mock
    SomeDataService someDataServiceMock;

    @Test
    void calculateSum_basic() {
        when(someDataServiceMock.retrieveAllData()).thenReturn(new int[]{1, 2, 3});
        assertEquals(6, business.calculateSumUsingDataService());
    }

    @Test
    void calculateSum_empty() {
        when(someDataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(0, business.calculateSumUsingDataService());
    }

    @Test
    void calculateSum_oneValue() {
        when(someDataServiceMock.retrieveAllData()).thenReturn(new int[]{5});
        assertEquals(5, business.calculateSumUsingDataService());
    }


}