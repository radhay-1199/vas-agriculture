package com.gl.agriculture.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.gl.agriculture.dao.PanelDao;
import com.gl.agriculture.model.PanelContentModal;



@Controller
public class MainController {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	PanelDao panelDao;
	
	@GetMapping("/index")
	public ModelAndView indexpage() throws Exception {
		  List<PanelContentModal> list = panelDao.allPanelData();
		  System.out.println("List"+list);
		  ModelAndView mv = new ModelAndView("index", "list",list);
		  return mv;
	}

	@GetMapping("/videopanelplayer/cnt_Id={id}")
	public ModelAndView player(@PathVariable int id) throws Exception {
		logger.info("reaching in player page..");
		PanelContentModal paneel = panelDao.panelvideo(id);
		String baseformate = paneel.getBase_format();
		logger.info("baseformate video ......." + baseformate);

		ModelAndView mv = new ModelAndView("videopanelplayer", "imagename", baseformate);

		return mv;
	}
	@GetMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("home");
	}
}
