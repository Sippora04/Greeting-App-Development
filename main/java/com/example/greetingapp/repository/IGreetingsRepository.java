package com.example.greetingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.greetingapp.model.Greeting;

public interface IGreetingsRepository extends JpaRepository<Greeting, Long> {

}