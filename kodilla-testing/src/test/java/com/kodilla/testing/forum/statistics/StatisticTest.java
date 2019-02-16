package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTest {

    public List<String> generateUserCount(int usersCount)
    {
        List<String> users = new ArrayList<>();
        for (int i=0; i < usersCount; i ++) {
            users.add("User" + i);
        }
        return users;
    }

    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();


        int usersCount = 100;

        List<String> usersNamesList = generateUserCount(usersCount);
        int postsCount = 1000;
        int commentsCount = 10;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        statisticsCalculator.showStatistics();

        //Then
        assertEquals(commentsCount / postsCount, statisticsCalculator.getAvgCommentCountPerPost(), 0);
        assertEquals(commentsCount / usersCount, statisticsCalculator.getAvgCommentCountPerUser(), 0);
        assertEquals(postsCount / usersCount, statisticsCalculator.getAvgPostCountPerUser(), 0);
    }



    @Test
    public void testCalculateUsers() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<String> users = new ArrayList<String>();
        int quantity = 100;
        for(int i=0; i<quantity; i++) {
            users.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(50);

        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(100, statisticsCalculator.getAvgCommentCountPerPost());
    }
}