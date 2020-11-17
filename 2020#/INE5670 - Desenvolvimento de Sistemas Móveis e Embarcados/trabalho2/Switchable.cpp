#include "Switchable.h"
#include <Arduino.h>

Switchable::Switchable(const int pin) : m_pin(pin)
{
    pinMode(m_pin, OUTPUT);
	off();
}

void Switchable::on()
{
	digitalWrite(m_pin, 1); 
	m_state = true;
}

void Switchable::off()
{
	digitalWrite(m_pin, 0); 
	m_state = false;
}

void Switchable::toggle()
{
	digitalWrite(m_pin, !m_state); 
	m_state = !m_state;
}

void Switchable::dim(int dimVal)
{
    analogWrite(m_pin, dimVal);
}
		
bool Switchable::getState()
{
    return m_state;
}

void Switchable::setState(bool state)
{
    digitalWrite(m_pin, state);
    m_state = state;
}