package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileDeleted extends AbstractEvent {

    private Long id;
}
