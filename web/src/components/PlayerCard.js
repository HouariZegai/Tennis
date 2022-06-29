import { Card, CardContent, Typography } from '@mui/material'
import React from 'react'

const PlayerCard = ({player}) => {
  return (
    <Card sx={{ minWidth: 275 }}>
        <CardContent>
            <Typography sx={{ fontSize: 14 }} color="text.secondary" gutterBottom>
                Player Name
            </Typography>
            <Typography variant="h5" component="div">
                {player?.name}
            </Typography>
            <Typography sx={{ mt: 1.5 }} color="text.secondary">Score</Typography>
            <Typography variant="body2" sx={{ fontSize: 35 }}>{player?.score}</Typography>
        </CardContent>
    </Card>
  )
}

export default PlayerCard