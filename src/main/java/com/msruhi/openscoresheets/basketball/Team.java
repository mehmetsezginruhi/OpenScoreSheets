package com.msruhi.openscoresheets.basketball;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Set;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Team {
    private final String clubName;
    private final Player cap;
    private final Coach coach;
    private final Coach coCoach;
    private final Set<Player> players;
    private final Set<Foul> teamFouls;
    private final Set<TimeOut> auszeiten;
}
