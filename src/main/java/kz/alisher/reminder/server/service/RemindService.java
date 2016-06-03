package kz.alisher.reminder.server.service;

import kz.alisher.reminder.server.entity.Remind;

import java.util.List;

/**
 * Created by Alisher on 04.06.2016.
 */
public interface RemindService {
    List<Remind> getAll();
    Remind getById(long id);
    Remind save(Remind remind);
    void remove(long id);
}
