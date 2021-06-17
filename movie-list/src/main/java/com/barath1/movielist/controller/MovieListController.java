package com.barath1.movielist.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.barath1.movielist.model.Movie;

@Controller
@RequestMapping("/")
public class MovieListController {

	@RequestMapping(method=RequestMethod.GET,value="/movies")
	public String getMoviesListByActor(Model model) {
		
		List<Movie> movielist = new ArrayList<Movie>();
		Movie movie = new Movie();
		movie.setActor("john");
		movie.setDescription("Mission Impossible");
		movie.setName("Master");
		
		movielist.add(movie);
		model.addAttribute("movie",movielist);
		
		
		return "movielist";
	}
}
