package br.ufg;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    Random r = new Random();

    @Test
    public void testSize100()
    {
        int[] arr = new int[100];
        int[] copyarr = new int[100];

        for(int i = 0; i < 100; i++){
            arr[i] = r.nextInt(1000);
        }
        copyarr = arr;

        long iterativeTime = System.currentTimeMillis();
        
        Sort.iterativeQS(arr);

        iterativeTime = System.currentTimeMillis() - iterativeTime;

        long recursiveTime = System.currentTimeMillis();

        Sort.recursiveQS(copyarr, 0, copyarr.length - 1);

        recursiveTime = System.currentTimeMillis() - recursiveTime;

        System.out.println("Abordagem iterativa levou " + iterativeTime);
        System.out.println("Abordagem recursiva levou " + recursiveTime);
    }

    @Test
    public void testSize1000()
    {
        int[] arr = new int[1000];
        int[] copyarr = new int[1000];

        for(int i = 0; i < 1000; i++){
            arr[i] = r.nextInt(1000);
        }
        copyarr = arr;

        long iterativeTime = System.currentTimeMillis();
        
        Sort.iterativeQS(arr);

        iterativeTime = System.currentTimeMillis() - iterativeTime;

        long recursiveTime = System.currentTimeMillis();

        Sort.recursiveQS(copyarr, 0, copyarr.length - 1);

        recursiveTime = System.currentTimeMillis() - recursiveTime;

        System.out.println("Abordagem iterativa levou " + iterativeTime);
        System.out.println("Abordagem recursiva levou " + recursiveTime);
    }

    @Test
    public void testSize10000()
    {
        int[] arr = new int[10000];
        int[] copyarr = new int[10000];

        for(int i = 0; i < 10000; i++){
            arr[i] = r.nextInt(1000);
        }
        copyarr = arr;

        long iterativeTime = System.currentTimeMillis();
        
        Sort.iterativeQS(arr);

        iterativeTime = System.currentTimeMillis() - iterativeTime;

        long recursiveTime = System.currentTimeMillis();

        Sort.recursiveQS(copyarr, 0, copyarr.length - 1);

        recursiveTime = System.currentTimeMillis() - recursiveTime;

        System.out.println("Abordagem iterativa levou " + iterativeTime);
        System.out.println("Abordagem recursiva levou " + recursiveTime);
    }
}
