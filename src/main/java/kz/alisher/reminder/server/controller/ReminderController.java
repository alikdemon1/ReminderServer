package kz.alisher.reminder.server.controller;

import kz.alisher.reminder.server.entity.Remind;
import kz.alisher.reminder.server.service.RemindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Alisher K on 02.06.2016.
 */

@RestController
public class ReminderController {

    @Autowired
    private RemindService remindService;

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders(){
        return remindService.getAll();
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getRemindById(@PathVariable("id") long rId){
        return remindService.getById(rId);
    }

    @RequestMapping(value = "/reminders", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveRemind(@RequestBody Remind remind){
        return remindService.save(remind);
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteRemind(@PathVariable("id") long rId){
        remindService.remove(rId);
    }
}