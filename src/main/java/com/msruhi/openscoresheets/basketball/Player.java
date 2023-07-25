package com.msruhi.openscoresheets.basketball;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Player {
    private final String givenName;
    private final String surname;
    private final String taMmbNr;
    private boolean cap = false;
    private boolean specialParticipant = false;
    private final String jerseyNumber;
}
