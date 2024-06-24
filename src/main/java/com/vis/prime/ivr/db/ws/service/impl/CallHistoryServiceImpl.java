package com.vis.prime.ivr.db.ws.service.impl;

import com.vis.prime.ivr.db.ws.entity.CallHistory;
import com.vis.prime.ivr.db.ws.entity.CallHistoryEntity;
import com.vis.prime.ivr.db.ws.entity.HostTransactions;
import com.vis.prime.ivr.db.ws.entity.HostTranscationEntity;
import com.vis.prime.ivr.db.ws.repository.CallHistoryRepository;
import com.vis.prime.ivr.db.ws.repository.HostTransactionsRepository;
import com.vis.prime.ivr.db.ws.service.CallHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CallHistoryServiceImpl implements CallHistoryService {

    @Autowired
    public CallHistoryRepository callHistoryRepository;

    @Autowired
    public HostTransactionsRepository hostTransactionsRepository;


    public boolean saveCallHistory(CallHistory callHistory) {
        try {
            CallHistoryEntity callHistoryEntity = new CallHistoryEntity();
            callHistoryEntity.setAnsweringAgentId(callHistory.getAnsweringAgentId());
            callHistoryEntity.setAnsweringAgentSkill(callHistory.getAnsweringAgentSkill());
            callHistoryEntity.setBookingId(callHistory.getBookingId());
            callHistoryEntity.setBookingStatus(callHistory.getBookingStatus());
            callHistoryEntity.setCallDuration(callHistory.getCallDuration());
            callHistoryEntity.setClid(callHistory.getClid());
            callHistoryEntity.setCliEntered(callHistory.getCliEntered());
            callHistoryEntity.setCustLanguage(callHistory.getCustLanguage());
            callHistoryEntity.setCustomerName(callHistory.getCustomerName());
            callHistoryEntity.setDnis(callHistory.getDnis());
            callHistoryEntity.setDuplicateCallFlag(callHistory.getDuplicateCallFlag());
            callHistoryEntity.setEndDateTime(callHistory.getEndDateTime());
            callHistoryEntity.setJobId(callHistory.getJobId());
            callHistoryEntity.setLastMenu1(callHistory.getLastMenu1());
            callHistoryEntity.setLastMenu2(callHistory.getLastMenu2());
            callHistoryEntity.setLastMenu3(callHistory.getLastMenu3());
            callHistoryEntity.setLastMenu4(callHistory.getLastMenu4());
            callHistoryEntity.setLastMenuID(callHistory.getLastMenuID());
            callHistoryEntity.setPriority(callHistory.getPriority());
            callHistoryEntity.setQueueTime(callHistory.getQueueTime());
            callHistoryEntity.setStartDateTime(callHistory.getStartDateTime());
            callHistoryEntity.setTaxiNumber(callHistory.getTaxiNumber());
            callHistoryEntity.setTransferCount(callHistory.getTransferCount());
            callHistoryEntity.setTransferedCallFlag(callHistory.getTransferedCallFlag());
            callHistoryEntity.setTransferReason(callHistory.getTransferReason());
            callHistoryEntity.setUcid(callHistory.getUcid());

            // Save the CallHistory object
            callHistoryRepository.save(callHistoryEntity);

            // Use a Set to store unique HostTransactions
            Set<HostTransactions> uniqueHostTransactions = new HashSet<>();
            if (callHistory.getHostTransaction() != null) {
                uniqueHostTransactions.addAll(callHistory.getHostTransaction());
            }

            // Save the unique HostTransactions objects
            for (HostTransactions hostTransaction : uniqueHostTransactions) {
                HostTranscationEntity hostTranscationEntity = new HostTranscationEntity();
                hostTranscationEntity.setIcdMessageId(hostTransaction.getIcdMessageId());
                hostTranscationEntity.setRequestDateTime(hostTransaction.getRequestDateTime());
                hostTranscationEntity.setResponseDateTime(hostTransaction.getResponseDateTime());
                hostTranscationEntity.setTransactionName(hostTransaction.getTransactionName());
                hostTranscationEntity.setRequestMessage(hostTransaction.getRequestMessage());
                hostTranscationEntity.setResponseMessage(hostTransaction.getResponseMessage());
                hostTranscationEntity.setUcid(hostTransaction.getUcid());
                hostTransactionsRepository.save(hostTranscationEntity);
            }

            return true; // Return true if the save operation was successful
        } catch (Exception e) {
            e.printStackTrace(); // Log any exceptions
            return false; // Return false if the save operation failed
        }
    }


}
