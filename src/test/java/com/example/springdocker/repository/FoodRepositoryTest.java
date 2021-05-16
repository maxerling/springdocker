package com.example.springdocker.repository;

import com.example.springdocker.model.Food;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Max Erling
 * Date: 2021-05-14
 * Copyright: MIT
 * Class: Java20B
 */
@DataMongoTest
class FoodRepositoryTest {

    @Autowired
    FoodRepository foodRepository;

    @Test
    void findFoodByCanICookIt() {
        Food food = new Food("1","Chicken",true,true);
        foodRepository.save(food);

        List<Food> foodList = foodRepository.findFoodByCanICookIt(true);

        assertEquals(true,foodList.contains(food));
        assertNotEquals(false,foodList.add(food));



    }
}