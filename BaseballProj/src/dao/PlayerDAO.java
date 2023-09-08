package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Player;

public class PlayerDAO {
//	선수등록
	public int insertPlayer(Player player) {
		int cnt = 0;
		
		return cnt;
	}
//	특정 선수조회(이름으로) => 여러명
	public List<Player> selectPlayerByName(String name){
		List<Player> playerList = new ArrayList<>();
		
		return playerList;
	}
	
	
//	특정 선수조회(등번호) => 여러명
	public List<Player> selectPlayerByBacknum(Integer backnum){
		List<Player> playerList = new ArrayList<>();
		
		return playerList;
	}
//	특정 선수조회(플레이어 번호로)
	public Player selectPlayerByNum(Integer num){
		Player player = new Player();
		
		return player;
	}
//	특정팀 소속 선수 목록 조회
	public List<Player> selectPlayerByTeam(String teamName){
		List<Player> playerList = new ArrayList<>();
		
		return playerList;
	}
}
