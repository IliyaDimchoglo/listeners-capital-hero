package com.skysoft.vaultlogic.contracts;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.0.1.
 */
public class CapitalHero extends Contract {
    private static final String BINARY = "0x6080604052348015600f57600080fd5b50603580601d6000396000f3006080604052600080fd00a165627a7a72305820f73985e0bd8d67146827788fce5640d2fb72cfe327ddf51954b749d23d8ef2ca0029";

    public static final Event KIOSKINFO_EVENT = new Event("KioskInfo", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<DynamicArray<Uint256>>() {}, new TypeReference<DynamicArray<Uint256>>() {}));
    ;

    public static final Event PREVIEWURL_EVENT = new Event("PreviewUrl", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}));
    ;

    public static final Event QRSCANNED_EVENT = new Event("QRScanned", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}));
    ;

    public static final Event PREVIEWSTOP_EVENT = new Event("PreviewStop", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
    ;

    public static final Event CASHINOPENED_EVENT = new Event("CashInOpened", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event CASHINBALANCEUPDATED_EVENT = new Event("CashInBalanceUpdated", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event CASHINCLOSED_EVENT = new Event("CashInClosed", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
    ;

    public static final Event CASHOUTOPENED_EVENT = new Event("CashOutOpened", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
    ;

    public static final Event CASHOUTVALIDATION_EVENT = new Event("CashOutValidation", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
    ;

    public static final Event CASHOUTCLOSED_EVENT = new Event("CashOutClosed", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
    ;

    public static final Event CASHDISPENSED_EVENT = new Event("CashDispensed", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event CASHOUTROLLBACK_EVENT = new Event("CashOutRollback", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
    ;

    public static final Event RECEIPTURLRECEIVED_EVENT = new Event("ReceiptURLReceived", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}));
    ;

    public static final Event RECEIPTPRINTED_EVENT = new Event("ReceiptPrinted", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
    ;

    public static final Event SESSIONCLOSED_EVENT = new Event("SessionClosed", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
    ;

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
    }

    @Deprecated
    protected CapitalHero(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected CapitalHero(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected CapitalHero(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected CapitalHero(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<KioskInfoEventResponse> getKioskInfoEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(KIOSKINFO_EVENT, transactionReceipt);
        ArrayList<KioskInfoEventResponse> responses = new ArrayList<KioskInfoEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            KioskInfoEventResponse typedResponse = new KioskInfoEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse._id = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse._location = (String) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse._name = (String) eventValues.getNonIndexedValues().get(3).getValue();
            typedResponse._timezone = (String) eventValues.getNonIndexedValues().get(4).getValue();
            typedResponse.bills = (List<BigInteger>) eventValues.getNonIndexedValues().get(5).getValue();
            typedResponse.billsCount = (List<BigInteger>) eventValues.getNonIndexedValues().get(6).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<KioskInfoEventResponse> kioskInfoEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, KioskInfoEventResponse>() {
            @Override
            public KioskInfoEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(KIOSKINFO_EVENT, log);
                KioskInfoEventResponse typedResponse = new KioskInfoEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse._id = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse._location = (String) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse._name = (String) eventValues.getNonIndexedValues().get(3).getValue();
                typedResponse._timezone = (String) eventValues.getNonIndexedValues().get(4).getValue();
                typedResponse.bills = (List<BigInteger>) eventValues.getNonIndexedValues().get(5).getValue();
                typedResponse.billsCount = (List<BigInteger>) eventValues.getNonIndexedValues().get(6).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<KioskInfoEventResponse> kioskInfoEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(KIOSKINFO_EVENT));
        return kioskInfoEventFlowable(filter);
    }

    public List<PreviewUrlEventResponse> getPreviewUrlEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(PREVIEWURL_EVENT, transactionReceipt);
        ArrayList<PreviewUrlEventResponse> responses = new ArrayList<PreviewUrlEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PreviewUrlEventResponse typedResponse = new PreviewUrlEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.url = (String) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<PreviewUrlEventResponse> previewUrlEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, PreviewUrlEventResponse>() {
            @Override
            public PreviewUrlEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PREVIEWURL_EVENT, log);
                PreviewUrlEventResponse typedResponse = new PreviewUrlEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.url = (String) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<PreviewUrlEventResponse> previewUrlEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PREVIEWURL_EVENT));
        return previewUrlEventFlowable(filter);
    }

    public List<QRScannedEventResponse> getQRScannedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(QRSCANNED_EVENT, transactionReceipt);
        ArrayList<QRScannedEventResponse> responses = new ArrayList<QRScannedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            QRScannedEventResponse typedResponse = new QRScannedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.token = (String) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<QRScannedEventResponse> qRScannedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, QRScannedEventResponse>() {
            @Override
            public QRScannedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(QRSCANNED_EVENT, log);
                QRScannedEventResponse typedResponse = new QRScannedEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.token = (String) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<QRScannedEventResponse> qRScannedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(QRSCANNED_EVENT));
        return qRScannedEventFlowable(filter);
    }

    public List<PreviewStopEventResponse> getPreviewStopEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(PREVIEWSTOP_EVENT, transactionReceipt);
        ArrayList<PreviewStopEventResponse> responses = new ArrayList<PreviewStopEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PreviewStopEventResponse typedResponse = new PreviewStopEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<PreviewStopEventResponse> previewStopEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, PreviewStopEventResponse>() {
            @Override
            public PreviewStopEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PREVIEWSTOP_EVENT, log);
                PreviewStopEventResponse typedResponse = new PreviewStopEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<PreviewStopEventResponse> previewStopEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PREVIEWSTOP_EVENT));
        return previewStopEventFlowable(filter);
    }

    public List<CashInOpenedEventResponse> getCashInOpenedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(CASHINOPENED_EVENT, transactionReceipt);
        ArrayList<CashInOpenedEventResponse> responses = new ArrayList<CashInOpenedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CashInOpenedEventResponse typedResponse = new CashInOpenedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CashInOpenedEventResponse> cashInOpenedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CashInOpenedEventResponse>() {
            @Override
            public CashInOpenedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CASHINOPENED_EVENT, log);
                CashInOpenedEventResponse typedResponse = new CashInOpenedEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<CashInOpenedEventResponse> cashInOpenedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CASHINOPENED_EVENT));
        return cashInOpenedEventFlowable(filter);
    }

    public List<CashInBalanceUpdatedEventResponse> getCashInBalanceUpdatedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(CASHINBALANCEUPDATED_EVENT, transactionReceipt);
        ArrayList<CashInBalanceUpdatedEventResponse> responses = new ArrayList<CashInBalanceUpdatedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CashInBalanceUpdatedEventResponse typedResponse = new CashInBalanceUpdatedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.balance = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CashInBalanceUpdatedEventResponse> cashInBalanceUpdatedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CashInBalanceUpdatedEventResponse>() {
            @Override
            public CashInBalanceUpdatedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CASHINBALANCEUPDATED_EVENT, log);
                CashInBalanceUpdatedEventResponse typedResponse = new CashInBalanceUpdatedEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.balance = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<CashInBalanceUpdatedEventResponse> cashInBalanceUpdatedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CASHINBALANCEUPDATED_EVENT));
        return cashInBalanceUpdatedEventFlowable(filter);
    }

    public List<CashInClosedEventResponse> getCashInClosedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(CASHINCLOSED_EVENT, transactionReceipt);
        ArrayList<CashInClosedEventResponse> responses = new ArrayList<CashInClosedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CashInClosedEventResponse typedResponse = new CashInClosedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CashInClosedEventResponse> cashInClosedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CashInClosedEventResponse>() {
            @Override
            public CashInClosedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CASHINCLOSED_EVENT, log);
                CashInClosedEventResponse typedResponse = new CashInClosedEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<CashInClosedEventResponse> cashInClosedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CASHINCLOSED_EVENT));
        return cashInClosedEventFlowable(filter);
    }

    public List<CashOutOpenedEventResponse> getCashOutOpenedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(CASHOUTOPENED_EVENT, transactionReceipt);
        ArrayList<CashOutOpenedEventResponse> responses = new ArrayList<CashOutOpenedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CashOutOpenedEventResponse typedResponse = new CashOutOpenedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.requestId = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.vlFee = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CashOutOpenedEventResponse> cashOutOpenedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CashOutOpenedEventResponse>() {
            @Override
            public CashOutOpenedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CASHOUTOPENED_EVENT, log);
                CashOutOpenedEventResponse typedResponse = new CashOutOpenedEventResponse();
                typedResponse.log = log;
                typedResponse.requestId = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.vlFee = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<CashOutOpenedEventResponse> cashOutOpenedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CASHOUTOPENED_EVENT));
        return cashOutOpenedEventFlowable(filter);
    }

    public List<CashOutValidationEventResponse> getCashOutValidationEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(CASHOUTVALIDATION_EVENT, transactionReceipt);
        ArrayList<CashOutValidationEventResponse> responses = new ArrayList<CashOutValidationEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CashOutValidationEventResponse typedResponse = new CashOutValidationEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CashOutValidationEventResponse> cashOutValidationEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CashOutValidationEventResponse>() {
            @Override
            public CashOutValidationEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CASHOUTVALIDATION_EVENT, log);
                CashOutValidationEventResponse typedResponse = new CashOutValidationEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<CashOutValidationEventResponse> cashOutValidationEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CASHOUTVALIDATION_EVENT));
        return cashOutValidationEventFlowable(filter);
    }

    public List<CashOutClosedEventResponse> getCashOutClosedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(CASHOUTCLOSED_EVENT, transactionReceipt);
        ArrayList<CashOutClosedEventResponse> responses = new ArrayList<CashOutClosedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CashOutClosedEventResponse typedResponse = new CashOutClosedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CashOutClosedEventResponse> cashOutClosedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CashOutClosedEventResponse>() {
            @Override
            public CashOutClosedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CASHOUTCLOSED_EVENT, log);
                CashOutClosedEventResponse typedResponse = new CashOutClosedEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<CashOutClosedEventResponse> cashOutClosedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CASHOUTCLOSED_EVENT));
        return cashOutClosedEventFlowable(filter);
    }

    public List<CashDispensedEventResponse> getCashDispensedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(CASHDISPENSED_EVENT, transactionReceipt);
        ArrayList<CashDispensedEventResponse> responses = new ArrayList<CashDispensedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CashDispensedEventResponse typedResponse = new CashDispensedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.requested_amount = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.dispensed_amount = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CashDispensedEventResponse> cashDispensedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CashDispensedEventResponse>() {
            @Override
            public CashDispensedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CASHDISPENSED_EVENT, log);
                CashDispensedEventResponse typedResponse = new CashDispensedEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.requested_amount = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.dispensed_amount = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<CashDispensedEventResponse> cashDispensedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CASHDISPENSED_EVENT));
        return cashDispensedEventFlowable(filter);
    }

    public List<CashOutRollbackEventResponse> getCashOutRollbackEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(CASHOUTROLLBACK_EVENT, transactionReceipt);
        ArrayList<CashOutRollbackEventResponse> responses = new ArrayList<CashOutRollbackEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CashOutRollbackEventResponse typedResponse = new CashOutRollbackEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CashOutRollbackEventResponse> cashOutRollbackEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CashOutRollbackEventResponse>() {
            @Override
            public CashOutRollbackEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CASHOUTROLLBACK_EVENT, log);
                CashOutRollbackEventResponse typedResponse = new CashOutRollbackEventResponse();
                typedResponse.log = log;
                typedResponse.channelId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<CashOutRollbackEventResponse> cashOutRollbackEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CASHOUTROLLBACK_EVENT));
        return cashOutRollbackEventFlowable(filter);
    }

    public List<ReceiptURLReceivedEventResponse> getReceiptURLReceivedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(RECEIPTURLRECEIVED_EVENT, transactionReceipt);
        ArrayList<ReceiptURLReceivedEventResponse> responses = new ArrayList<ReceiptURLReceivedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ReceiptURLReceivedEventResponse typedResponse = new ReceiptURLReceivedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.receiptId = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.url = (String) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ReceiptURLReceivedEventResponse> receiptURLReceivedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, ReceiptURLReceivedEventResponse>() {
            @Override
            public ReceiptURLReceivedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(RECEIPTURLRECEIVED_EVENT, log);
                ReceiptURLReceivedEventResponse typedResponse = new ReceiptURLReceivedEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.receiptId = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.url = (String) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<ReceiptURLReceivedEventResponse> receiptURLReceivedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(RECEIPTURLRECEIVED_EVENT));
        return receiptURLReceivedEventFlowable(filter);
    }

    public List<ReceiptPrintedEventResponse> getReceiptPrintedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(RECEIPTPRINTED_EVENT, transactionReceipt);
        ArrayList<ReceiptPrintedEventResponse> responses = new ArrayList<ReceiptPrintedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ReceiptPrintedEventResponse typedResponse = new ReceiptPrintedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ReceiptPrintedEventResponse> receiptPrintedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, ReceiptPrintedEventResponse>() {
            @Override
            public ReceiptPrintedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(RECEIPTPRINTED_EVENT, log);
                ReceiptPrintedEventResponse typedResponse = new ReceiptPrintedEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<ReceiptPrintedEventResponse> receiptPrintedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(RECEIPTPRINTED_EVENT));
        return receiptPrintedEventFlowable(filter);
    }

    public List<SessionClosedEventResponse> getSessionClosedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(SESSIONCLOSED_EVENT, transactionReceipt);
        ArrayList<SessionClosedEventResponse> responses = new ArrayList<SessionClosedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            SessionClosedEventResponse typedResponse = new SessionClosedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<SessionClosedEventResponse> sessionClosedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, SessionClosedEventResponse>() {
            @Override
            public SessionClosedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(SESSIONCLOSED_EVENT, log);
                SessionClosedEventResponse typedResponse = new SessionClosedEventResponse();
                typedResponse.log = log;
                typedResponse.sessionId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.success = (Boolean) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<SessionClosedEventResponse> sessionClosedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(SESSIONCLOSED_EVENT));
        return sessionClosedEventFlowable(filter);
    }

    @Deprecated
    public static CapitalHero load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new CapitalHero(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static CapitalHero load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new CapitalHero(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static CapitalHero load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new CapitalHero(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static CapitalHero load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new CapitalHero(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<CapitalHero> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(CapitalHero.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<CapitalHero> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(CapitalHero.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<CapitalHero> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(CapitalHero.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<CapitalHero> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(CapitalHero.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static class KioskInfoEventResponse {
        public Log log;

        public BigInteger sessionId;

        public String _id;

        public String _location;

        public String _name;

        public String _timezone;

        public List<BigInteger> bills;

        public List<BigInteger> billsCount;
    }

    public static class PreviewUrlEventResponse {
        public Log log;

        public BigInteger sessionId;

        public String url;
    }

    public static class QRScannedEventResponse {
        public Log log;

        public BigInteger sessionId;

        public String token;
    }

    public static class PreviewStopEventResponse {
        public Log log;

        public BigInteger sessionId;

        public Boolean success;
    }

    public static class CashInOpenedEventResponse {
        public Log log;

        public BigInteger sessionId;

        public BigInteger channelId;
    }

    public static class CashInBalanceUpdatedEventResponse {
        public Log log;

        public BigInteger sessionId;

        public BigInteger channelId;

        public BigInteger balance;
    }

    public static class CashInClosedEventResponse {
        public Log log;

        public BigInteger sessionId;

        public BigInteger channelId;

        public Boolean success;
    }

    public static class CashOutOpenedEventResponse {
        public Log log;

        public String requestId;

        public BigInteger channelId;

        public BigInteger vlFee;

        public Boolean success;
    }

    public static class CashOutValidationEventResponse {
        public Log log;

        public BigInteger sessionId;

        public BigInteger channelId;

        public Boolean success;
    }

    public static class CashOutClosedEventResponse {
        public Log log;

        public BigInteger sessionId;

        public BigInteger channelId;

        public Boolean success;
    }

    public static class CashDispensedEventResponse {
        public Log log;

        public BigInteger sessionId;

        public BigInteger channelId;

        public BigInteger requested_amount;

        public BigInteger dispensed_amount;
    }

    public static class CashOutRollbackEventResponse {
        public Log log;

        public BigInteger channelId;

        public Boolean success;
    }

    public static class ReceiptURLReceivedEventResponse {
        public Log log;

        public BigInteger sessionId;

        public String receiptId;

        public String url;
    }

    public static class ReceiptPrintedEventResponse {
        public Log log;

        public BigInteger sessionId;

        public Boolean success;
    }

    public static class SessionClosedEventResponse {
        public Log log;

        public BigInteger sessionId;

        public Boolean success;
    }
}
