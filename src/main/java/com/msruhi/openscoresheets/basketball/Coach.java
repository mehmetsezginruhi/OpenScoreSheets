package com.msruhi.openscoresheets.basketball;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Coach {
    private final String givenName;
    private final String surname;
    private final String licenseLevel;
    private final String licenseNumber;
}
