package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Performer;
import com.oguzkaganmustafa.festivalmanager.entity.Shows;
import com.oguzkaganmustafa.festivalmanager.repository.ShowsRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ShowsServiceTest {

    @InjectMocks
    ShowsService showsService;
    @Mock
    ShowsRepository showsRepository;

    @Test
    void getCrowdedShows() {

        List<Shows> showsList = new ArrayList<>();

        Performer performer1 = new Performer();
        Performer performer2 = new Performer();

        Shows show1 = new Shows();

        List<Performer> performerList1 = new ArrayList<>();
        performerList1.add(performer1);

        show1.setPerformers(performerList1);
        showsList.add(show1);
        //----------------------

        Shows show2 = new Shows();

        List<Performer> performerList2 = new ArrayList<>();
        performerList2.add(performer1);
        performerList2.add(performer2);

        show2.setPerformers(performerList2);
        showsList.add(show2);

        //----------------------

        Shows show3 = new Shows();

        List<Performer> performerList3 = new ArrayList<>();
        performerList3.add(performer1);
        performerList3.add(performer2);

        show3.setPerformers(performerList3);
        showsList.add(show3);

        when(showsService.getCrowdedShows()).thenReturn(showsList);

        List<Shows> shows = showsService.getCrowdedShows();
        assertEquals(2,shows.size());
    }
}