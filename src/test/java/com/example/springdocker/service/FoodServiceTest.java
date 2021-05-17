package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.repository.FoodRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
    public void saveNewFoodTest() {

        //foodService.saveNewFood();
    }
}