package com.company.footballinquiry.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.footballinquiry.dto.TeamStandingDto;
import com.company.footballinquiry.log.annotation.Trace;
import com.company.footballinquiry.log.eventtype.LogEventType;
import com.company.footballinquiry.model.TeamStandingRequest;
import com.company.footballinquiry.service.TeamStandingService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Dinesh Lohia
 */

@Slf4j
@RestController
@RequestMapping("/api/service/v1/team/standing")
public class FootBallStandingController {

	private static Logger log = LoggerFactory.getLogger(FootBallStandingController.class);
	private final TeamStandingService teamStandingService;

	@Autowired
	public FootBallStandingController(TeamStandingService teamStandingService) {
		this.teamStandingService = teamStandingService;
	}

	@GetMapping
	@Trace(type = LogEventType.CONTROLLER)
	public ResponseEntity<TeamStandingDto> getStandings(@Valid TeamStandingRequest teamStandingRequest) {
		log.info("Request {}", teamStandingRequest.toString());
		return ResponseEntity.ok(teamStandingService.getTeamStanding(teamStandingRequest));
	}

}
