# ReminderServer
### Restful web service for android app Reminder
----------------------------------------------------------------------
1. Get all reminders

```java
 @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders(){
        return remindService.getAll();
    }
```
![get_all.png](/images/get_all.png)

