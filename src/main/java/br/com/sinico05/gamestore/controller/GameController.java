package br.com.sinico05.gamestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.sinico05.gamestore.model.Game;
import br.com.sinico05.gamestore.repository.GameRepository;

@Controller
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/list")
    public ModelAndView getListGame() {
        ModelAndView mv = new ModelAndView("game-list");
        mv.addObject("games", gameRepository.findAll());
        return mv;
    }

    @GetMapping("/addgame")
    public String getAddGame() {
        return "game-add";
    }

    @PostMapping("/add")
    public String postAddGame(Game game) {
        gameRepository.save(game);
        return "redirect:/game-list";
    }

}
