var soap = require('soap-js');
var url = 'https://tom-test.vgwort.de/services/1.0/pixelService.wsdl';
var args = '<orderPixelRequest xmlns="http://vgwort.de/1.0/PixelService/xsd"><count>1</count></orderPixelRequest>';
soap.createClient(url, function(err, client) {
	client.orderPixel(args, function(err, result) {
		console.log(err);
		console.log(result);
	});
});

exports.awesome = function() {
	return 'awesome';
};
