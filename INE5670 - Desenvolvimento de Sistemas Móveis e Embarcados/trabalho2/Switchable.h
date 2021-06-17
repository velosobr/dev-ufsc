#ifndef _SWITCHABLE_H_
#define _SWITCHABLE_H_

class Switchable  
{
	public:

	    Switchable(const int pin);

		void on();

		void off();
		
		void toggle();
		
		void dim(int dimVal);
		
		bool getState();
		
		void setState(bool state);
	
	private:
	
		const int m_pin; 	
		bool m_state;		
};

#endif