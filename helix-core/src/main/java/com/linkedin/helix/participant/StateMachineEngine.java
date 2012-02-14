package com.linkedin.helix.participant;

import com.linkedin.helix.messaging.handling.MessageHandlerFactory;
import com.linkedin.helix.participant.statemachine.StateModel;
import com.linkedin.helix.participant.statemachine.StateModelFactory;

public interface StateMachineEngine extends MessageHandlerFactory
{
  public boolean registerStateModelFactory(String stateModelDef, 
                                           StateModelFactory<? extends StateModel> factory);
  
  public boolean registerStateModelFactory(String stateModelDef, 
                                           String resourceName, 
                                           StateModelFactory<? extends StateModel> factory);
  
  public boolean removeStateModelFactory(String stateModelDef, 
      StateModelFactory<? extends StateModel> factory);
  
  public boolean removeStateModelFactory(String stateModelDef, 
      String resourceName, 
      StateModelFactory<? extends StateModel> factory);
  
}
