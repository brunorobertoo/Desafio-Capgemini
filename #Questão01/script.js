for (let linha = 1; linha <= 6; linha++) {
	let padrao = '';
	for (let j = 6 - linha; j >= 1; j--) {
		padrao += ' ';
	}
	for (let i = 0; i < linha; i++) {
		padrao += '*';
	}
	console.log(padrao)
}