package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.repository.FoodRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

/**
 * Created by Max Erling
 * Date: 2021-05-16
 * Copyright: MIT
 * Class: Java20B
 */

@ExtendWith(MockitoExtension.class)
class FoodServiceTest {

    FoodService foodService;

    @Mock
    FoodRepository mockRepository;

    @BeforeEach
    public void init() {
        foodService = new FoodService(mockRepository);
    }
    @Test
    public void getFoodsTest() {
        foodService.getFoods();
        verify(mockRepository).findAll();

    }

    @Test
    public void getCookableFoodsTest() {
        Food mockFood = new Food("1","chicken",true,true);
        when(mockRepository.findFoodByCanICookIt(true)).thenReturn(Arrays.asList(mockFood));

        //--

        List<String> actual = foodService.getCookableFoods();

        //--

        assertEquals("chicken",actual.get(0));
        assertEquals(1,actual.size());
        verify(mockRepository).findFoodByCanICookIt(true);



    }

    @Test
    public void saveNewFoodSuccessfulTest() {
        Food mockFood = new Food("1","chicken",true,true);
        when(mockRepository.save(any())).thenReturn(mockFood);

        Food actual = foodService.saveNewFood(mockFood);

        assertEquals(mockFood,actual);
        verify(mockRepository).save(any());
    }

    @Disabled
    @Test
    public void saveNewFoodInvalidTest() {
        //3:04:14
        Food mockFood = new Food("1","chicken",true,true);

        assertThrows(ResponseStatusException.class, () -> foodService.saveNewFood(mockFood));

        verify(mockRepository, times(0)).save(any());
    }

    @Disabled
    @Test
    public void saveNewFoodExistingTest() {
        //4:22:50
        Food mockFood = new Food("1","chicken",true,true);
        when(mockRepository.save(any())).thenReturn(mockFood);

        assertThrows(ResponseStatusException.class, () -> foodService.saveNewFood(mockFood));

        verify(mockRepository, times(0)).save(any());
    }
}