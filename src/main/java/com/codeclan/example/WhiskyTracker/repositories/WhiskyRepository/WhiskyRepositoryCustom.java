package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    List<Whisky> findWhiskiesOfAgeFromDistillery(int age, String distilleryName);

    List<Whisky> findWhiskiesFromRegion(String region);

}
