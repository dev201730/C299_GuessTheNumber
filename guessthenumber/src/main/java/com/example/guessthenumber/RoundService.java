package com.example.guessthenumber;

import java.util.List;


public interface RoundService {

	Round createRound(Round round);

    List<Round> findRounds(Long id);
}