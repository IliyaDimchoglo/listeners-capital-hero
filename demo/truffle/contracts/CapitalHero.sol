pragma solidity 0.4.24;

contract CapitalHero {

event KioskInfo(uint256 sessionId, string _id, string _location, string _name, string _timezone, uint256[] bills, uint256[] billsCount);
event PreviewUrl(uint256 sessionId, string url);
event QRScanned(uint256 sessionId, string token);
event PreviewStop(uint256 sessionId, bool success);
event CashInOpened(uint256 sessionId, uint256 channelId);
event CashInBalanceUpdated(uint256 sessionId, uint256 channelId, uint256 balance);
event CashInClosed(uint256 sessionId, uint256 channelId, bool success);
event CashOutOpened(string requestId, uint256 channelId, uint256 vlFee, bool success);
event CashOutValidation(uint256 sessionId, uint256 channelId, bool success);
event CashOutClosed(uint256 sessionId, uint256 channelId, bool success);
event CashDispensed(uint256 sessionId, uint256 channelId, uint256 requested_amount, uint256 dispensed_amount);
event CashOutRollback(uint256 channelId, bool success);
event ReceiptURLReceived(uint256 sessionId, string receiptId, string url);
event ReceiptPrinted(uint256 sessionId, bool success);
event SessionClosed(uint256 sessionId, bool success);

}