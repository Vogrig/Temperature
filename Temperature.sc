Temperature :PureUGen{
	*kr { arg scale = 1.0;
		^this.multiNew('control', scale)
	}
}
