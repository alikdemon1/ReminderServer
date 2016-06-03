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

2. Get reminder by id

```java
 @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getRemindById(@PathVariable("id") long rId){
        return remindService.getById(rId);
    }
```
