package com.example.guessthenumber;

public interface GameService {

	Game createGame(Game game);
	
	Game findGame(Long id);
	Game getGame(Long id);

	Iterable<Game> listGames();
	
	Game finishGame(Long id);
}