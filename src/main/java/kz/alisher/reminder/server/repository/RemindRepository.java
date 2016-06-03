package kz.alisher.reminder.server.repository;

import kz.alisher.reminder.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alisher on 03.06.2016.
 */
public interface RemindRepository extends JpaRepository<Remind, Long> {
}
