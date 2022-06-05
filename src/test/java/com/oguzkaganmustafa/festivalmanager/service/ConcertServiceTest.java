package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Concert;
import com.oguzkaganmustafa.festivalmanager.repository.ConcertRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ConcertServiceTest {
    @InjectMocks
    ConcertService concertService;
    @Mock
    ConcertRepository concertRepository;

    @Test
    void getConcertDescContains() {
        ArrayList<Concert> concerts = new ArrayList<>();
        concerts.add(new Concert());
        concerts.add(new Concert());

        when(concertRepository.findByDescriptionContains("Man")).thenReturn(concerts);

        List<Concert> concertList = concertService.getConcertDescContains("Man");
        assertEquals(2, concertList.size());
    }

    @Test
    void getLongestConcerts(){
        ArrayList<Concert> concerts = new ArrayList<>();
        Concert concert1 = new Concert();
        concert1.setDuration(4);
        concerts.add(concert1);

        Concert concert2 = new Concert();
        concert2.setDuration(3);
        concerts.add(concert2);

        Concert concert3 = new Concert();
        concert3.setDuration(4);
        concerts.add(concert3);

        Concert concert4 = new Concert();
        concert4.setDuration(1);
        concerts.add(concert4);

        //if this called, return the list i created.
        when(concertService.getLongestConcerts()).thenReturn(concerts);

        //compare the results. should return 4, 4. two items.
        List<Concert> concertList = concertService.getLongestConcerts();
        assertEquals(2, concertList.size());

    }


}
