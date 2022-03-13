package com.stegemont.source.enterprise;

import com.stegemont.source.student.*;
import com.stagemont.entities.User;

/**
 *
 * @author Nicolas Brunet
 */
public interface EnterpriseDAO {

    public User getEntepriseFromId(int id);
}
