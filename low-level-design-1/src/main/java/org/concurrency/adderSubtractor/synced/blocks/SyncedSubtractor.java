package org.concurrency.adderSubtractor.synced.blocks;

import lombok.AllArgsConstructor;
import org.concurrency.adderSubtractor.Count;

@AllArgsConstructor
public class SyncedSubtractor implements Runnable{
    private Count count;
    @Override
    public void run() {
        synchronized(count) {
            for (int i = 1; i <= 100; i++) {
                int value = count.getCount();
                value = value - i;
                count.setCount(value);
            }
        }
    }
}

//monitoring object could be instance or class