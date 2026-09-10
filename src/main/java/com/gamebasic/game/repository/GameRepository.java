package com.gamebasic.game.repository;

import com.gamebasic.game.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long>
{
    // TODO (Lv 7): API 명세의 조회 요구사항에 필요한 메서드를 설계하세요.
    // Asc = 오름차순, Desc = 내림차순
    // 게임 목록은 Game의 id 기준 내림차순
    List<Game> findAllByOrderByIdDesc();
}
