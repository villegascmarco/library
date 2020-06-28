$.getJSON('https://ipapi.co/json/', function (data) {
    alert(JSON.stringify(data, null, 2));
});