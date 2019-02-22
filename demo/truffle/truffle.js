module.exports = {
    networks: {
        staging: {
            host: "35.188.28.38",
            port: 22000,
            network_id: "16931",
            gasPrice: 0,
            gas: 4500000
        },
        office_node: {
            host: "192.168.1.253",
            port: 22000,
            network_id: "35807",
            gasPrice: 0,
            gas: 4500000
        },
        production: {
            host: "35.184.180.245",
            port: 22000,
            network_id: "65457",
            gasPrice: 0,
            gas: 4500000
        }
    },
    solc: {
        optimizer: {
            enabled: true,
            runs: 200
        }
    }
};